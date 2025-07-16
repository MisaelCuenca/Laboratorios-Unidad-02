package Proyect.JavaFX;

import javafx.scene.control.Button;

public class ProductoController {
	private final ProductoView vista;

	public ProductoController(ProductoView vista, Button btnAgregar, Button btnEliminar) {
		this.vista = vista;

		btnAgregar.setOnAction(e -> {
			try {
				String codigo = vista.getCodigoInput().getText();
				String nombre = vista.getNombreInput().getText();
				double precio = Double.parseDouble(vista.getPrecioInput().getText());
				int stock = Integer.parseInt(vista.getStockInput().getText());

				boolean existe = vista.getProductos().stream().anyMatch(p -> p.getCodigo().equals(codigo));
				if (existe) {
					System.out.println("Código duplicado");
					return;
				}

				Producto p = new Producto(codigo, nombre, precio, stock);
				vista.getProductos().add(p);

				vista.getCodigoInput().clear();
				vista.getNombreInput().clear();
				vista.getPrecioInput().clear();
				vista.getStockInput().clear();
			} catch (NumberFormatException ex) {
				System.out.println("Precio o stock inválido");
			}
		});

		btnEliminar.setOnAction(e -> {
			Producto seleccionado = vista.getTabla().getSelectionModel().getSelectedItem();
			if (seleccionado != null) {
				vista.getProductos().remove(seleccionado);
			}
		});
	}

	public ProductoView getVista() {
		return vista;
	}
}