@EJB(beanName="NoSleep")
@Resource(name="my/DataSource")
@Stateless
public class OverworkedBean implements Overworked {
	
	@Resource
	private EntityManager myEntityManager;

	@Resource
	private EntityManagerFactory myEntityManagerFactory;

	@Init
	public void comeInEarly() {

	}

	//...

}