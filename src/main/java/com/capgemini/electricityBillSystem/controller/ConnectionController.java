package com.capgemini.electricityBillSystem.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.electricityBillSystem.Pojos.Connection;
import com.capgemini.electricityBillSystem.Pojos.ConnectionDto;
import com.capgemini.electricityBillSystem.Pojos.Customer;
import com.capgemini.electricityBillSystem.exception.NoSuchConnectionException;
import com.capgemini.electricityBillSystem.exception.NoSuchCustomerException;
import com.capgemini.electricityBillSystem.service.ConnectionService;

import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/connection")
@CrossOrigin(origins = "*")
public class ConnectionController {

    private static final Logger LOG = LoggerFactory.getLogger(ConnectionController.class);

    @Autowired
    private ConnectionService connectionService; 
    
//    @PostMapping("/addConnection")
//    public ResponseEntity<Connection> addConnection(@RequestBody ConnectionDto connDto) throws NoSuchConnectionException {
//    	 LOG.info(connDto.toString());
//    	 HttpHeaders headers = new HttpHeaders();
//    	headers.add("message", "connection created successfully.");
//    		
//    		Customer customer = new Customer();
//    		customer.setCustomerId(connDto.getCustomerId());
//    		Connection conn =new Connection(connDto.getConsumerNumber(),customer,connDto.getFlatOrHouseNumber(),connDto.getVillageName(),connDto.getDistrictName(),connDto.getState(),connDto.getPincode(),connDto.getConnectionType(),connDto.getApplicationDate(),connDto.getConnectionDate(),connDto.getConnectionStatus());
//        return new ResponseEntity<Connection>(connectionService.newConnectionRequest(conn), headers, HttpStatus.CREATED);  
//    }
    

    
    @PostMapping("/addConnection")
    public ResponseEntity<Connection> addConnection(@RequestBody Connection connection) throws NoSuchConnectionException {
    	 LOG.info(connection.toString());
    	 HttpHeaders headers = new HttpHeaders();
    		headers.add("message", "connection created successfully.");
//        return connectionService.newConnectionRequest(connection);
        return new ResponseEntity<Connection>(connectionService.newConnectionRequest(connection), headers, HttpStatus.CREATED);  
    }
    
 // http://localhost:8082/connection/getallconnection
    
    @GetMapping("/all")
	public List<Connection> getAllConnection() {
		LOG.info("getAllConnection"); // in normal block
//		LOG.debug("getAllEmps"); // in debug mode 
		return connectionService.getAllConnection();
	}
    
    @GetMapping("/id/{connectionId}")
	public ResponseEntity<Connection>getConnectionById(@PathVariable(name = "connectionId")Long connectionId) throws NoSuchConnectionException {
		LOG.info("getConnectionById");
		Connection connection = connectionService.getConnectionById(connectionId); 
		LOG.info(connection.toString());
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This connection is available in the database.");
		LOG.info(headers.toString());
		ResponseEntity<Connection> response = new ResponseEntity<Connection>(connection,headers,HttpStatus.OK);
		return response;
	}
    
 // http://localhost:8082/modifyConnection
 	@PutMapping("/modifyConnection")
 	public Connection updateConnection(@RequestBody Connection connection) throws NoSuchConnectionException {
 		System.out.println("Controller updateConnection");
 		return connectionService. modifyConnection(connection);
 	}
 	

 	
	/*@GetMapping("/getConnection/{customerId}")
	public ResponseEntity<Connection>getConnectionByCustomerId(@PathVariable(name = "customerId")int customerId) throws NoSuchConnectionException{
  			LOG.info("getConnectionById");
		Connection connection = connectionService.getConnectionById(customerId); 
			LOG.info(connection.toString());
			HttpHeaders headers = new HttpHeaders();
			headers.add("message", "This connection is available in the database.");
		LOG.info(headers.toString());
		ResponseEntity<Connection> response = new ResponseEntity<Connection>(connection,headers,HttpStatus.OK);
			return response;
		}*/
		
       
    
 // http://localhost:8082/connection/modifyConnectionAddress
    
//	@PutMapping("/modifyConnectionAddress")
//	public Connection updateAddress(@RequestBody Connection connection) throws NoSuchConnectionException {
//		LOG.info("Controller updateConnectionAdddress");
//		return connectionService.modifyConnectionAddress(connection);
//	}
	
	
	
	/*@GetMapping("/getConnectionbypincode/{pincode}")
	public ResponseEntity<Connection> getConnectionsByPincode(@PathVariable(name = "pincode")int pincode) throws NoSuchConnectionException {
		LOG.info("getConnectionByPincode");
		List<Connection> connection = connectionService. getConnectionsByPincode(pincode); 
		LOG.info(connection.toString());
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This connections is available in the database.");
		LOG.info(headers.toString());
		ResponseEntity<Connection> response = new ResponseEntity<Connection>((Connection) connection,headers,HttpStatus.OK);
		return response;
	}*/
	
	// http://localhost:8082/getConnectionbyId/{connectionId}
	
	
// http://localhost:8082/getConnectionbyId/{customerId}
	

}
