package bean;

import java.util.ArrayList;

@Entity
public class SolicitudArticuloBean {
	private Integer id;
	private ArrayList<ArticuloBean> articulos;
	private boolean cumplimiento;
	
	public SolicitudArticuloBean(Integer id, ArrayList<ArticuloBean> articulos, boolean cumplimiento) {
		super();
		this.id = id;
		this.articulos = articulos;
		this.cumplimiento = cumplimiento;
	}
	
	public SolicitudArticuloBean() {

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

	public boolean isCumplimiento() {
		return cumplimiento;
	}

	public void setCumplimiento(boolean cumplimiento) {
		this.cumplimiento = cumplimiento;
	}
	
}
