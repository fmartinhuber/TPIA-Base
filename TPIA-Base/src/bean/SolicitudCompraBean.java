package bean;

import java.util.ArrayList;

@Entity
public class SolicitudCompraBean {
	private Integer id;
	private ArrayList<ArticuloBean> articulos;
	
	public SolicitudCompraBean(Integer id, ArrayList<ArticuloBean> articulos) {
		super();
		this.id = id;
		this.articulos = articulos;
	}
	
	public SolicitudCompraBean() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ArrayList<ArticuloBean> getArticulos() {
		return articulos;
	}

	public void setArticulos(ArrayList<ArticuloBean> articulos) {
		this.articulos = articulos;
	}
	
}