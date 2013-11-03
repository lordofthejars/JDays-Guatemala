public class BookDao {

	@Resource(name = "myDatasource")
	private DataSource dataSource;
	
	@Resource(name = "mongo")
	private MongoProvider mongo;

	//...
}