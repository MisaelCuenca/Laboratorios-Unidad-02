package Proyect.JavaFX;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProductoView {
	private final TableView<Producto> tabla;
	private final TextField codigoInput;
	private final TextField nombreInput;
	private final TextField precioInput;
	private final TextField stockInput;
	private final TextField filtroInput;
	private final Label totalProductos;
	private final Label totalInventario;
	private final ObservableList<Producto> productos;
	private final FilteredList<Producto> productosFiltrados;

	@SuppressWarnings("unchecked")
	public ProductoView(Stage stage) {
		tabla = new TableView<>();
		productos = FXCollections.observableArrayList();
		productosFiltrados = new FilteredList<>(productos, p -> true);

		TableColumn<Producto, String> colCodigo = new TableColumn<>("Código");
		colCodigo.setCellValueFactory(cellData -> cellData.getValue().codigoProperty());

		TableColumn<Producto, String> colNombre = new TableColumn<>("Nombre");
		colNombre.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());

		TableColumn<Producto, Number> colPrecio = new TableColumn<>("Precio");
		colPrecio.setCellValueFactory(cellData -> cellData.getValue().precioProperty());

		TableColumn<Producto, Number> colStock = new TableColumn<>("Stock");
		colStock.setCellValueFactory(cellData -> cellData.getValue().stockProperty());

		tabla.setItems(productosFiltrados);
		tabla.getColumns().addAll(colCodigo, colNombre, colPrecio, colStock);

		codigoInput = new TextField();
		codigoInput.setPromptText("Código");
		nombreInput = new TextField();
		nombreInput.setPromptText("Nombre");
		precioInput = new TextField();
		precioInput.setPromptText("Precio");
		stockInput = new TextField();
		stockInput.setPromptText("Stock");

		Button btnAgregar = new Button("Agregar");
		Button btnEliminar = new Button("Eliminar");

		filtroInput = new TextField();
		filtroInput.setPromptText("Filtrar por nombre");
		filtroInput.textProperty().addListener((obs, oldVal, newVal) -> {
			productosFiltrados.setPredicate(prod -> newVal == null || newVal.isEmpty()
					|| prod.getNombre().toLowerCase().contains(newVal.toLowerCase()));
		});

		totalProductos = new Label();
		totalInventario = new Label();

		totalProductos.textProperty().bind(Bindings.size(productosFiltrados).asString("Total productos: %d"));
		totalInventario.textProperty().bind(Bindings.createStringBinding(() -> {
			double total = productosFiltrados.stream().mapToDouble(p -> p.getPrecio() * p.getStock()).sum();
			return String.format("Total inventario: $%.2f", total);
		}, productosFiltrados));

		VBox vbox = new VBox(10, codigoInput, nombreInput, precioInput, stockInput, btnAgregar, btnEliminar,
				filtroInput, tabla, totalProductos, totalInventario);
		vbox.setPadding(new Insets(10));

		stage.setScene(new Scene(vbox, 600, 600));
		stage.setTitle("Gestor de Productos con Stock");
		stage.show();

		new ProductoController(this, btnAgregar, btnEliminar);
	}

	public ObservableList<Producto> getProductos() {
		return productos;
	}

	public TableView<Producto> getTabla() {
		return tabla;
	}

	public TextField getCodigoInput() {
		return codigoInput;
	}

	public TextField getNombreInput() {
		return nombreInput;
	}

	public TextField getPrecioInput() {
		return precioInput;
	}

	public TextField getStockInput() {
		return stockInput;
	}
}
