package com.codebind.layered3;

@Repository

public class Repp extends JpaRepository<CustomerEntity, Long>{
	
	 CustomerEntity findByUsername(String username);

}
