package bean;

@Entity
public class ArticuloBean {
	private Integer id;
	private String codigo;
	private String nombre;
	private String tipo;
	private Integer cantidad;
	
	public ArticuloBean(Integer id, String codigo, String nombre, String tipo, Integer cantidad) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.cantidad = cantidad;
	}
	
	public ArticuloBean() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
}
