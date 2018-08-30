package pl.piomin.microservices.advanced.customer.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	/*@Autowired
	private AccountClient accountClient;*/
	
	@GetMapping(value = "/health")
	public ResponseEntity<String> hello(){
		return new ResponseEntity<String>("Customer-service is up", HttpStatus.OK);
	}
	
	/*@Autowired
	CustomerRepository repository;
	
	protected Logger logger = Logger.getLogger(CustomerController.class.getName());
	
	@RequestMapping(value = "/customers/pesel/{pesel}", method = RequestMethod.GET)
	public Customer findByPesel(@PathVariable("pesel") String pesel) {
		logger.info(String.format("Customer.findByPesel(%s)", pesel));
		return repository.findByPesel(pesel);
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customer> findAll() {
		logger.info("Customer.findAll()");
		return repository.findAll();
	}
	
	@RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
	public Customer findById(@PathVariable("id") String id) {
		logger.info(String.format("Customer.findById(%s)", id));
		Customer customer = repository.findById(id);
		List<Account> accounts =  accountClient.getAccounts(id);
		customer.setAccounts(accounts);
		return customer;
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	public Customer add(@RequestBody Customer customer) {
		logger.info(String.format("Customer.add(%s)", customer));
		return repository.save(customer);
	}*/
	
}
