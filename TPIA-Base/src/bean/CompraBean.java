package bean;

@Entity
public class CompraBean {
	private Integer id; 
	private SolicitudCompraBean solicitudCompra;
	
	public CompraBean(Integer id, SolicitudCompraBean solicitudCompra) {
		super();
		this.id = id;
		this.solicitudCompra = solicitudCompra;
	}
	
	public CompraBean() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SolicitudCompraBean getSolicitudCompra() {
		return solicitudCompra;
	}

	public void setSolicitudCompra(SolicitudCompraBean solicitudCompra) {
		this.solicitudCompra = solicitudCompra;
	}
	
}
