# api-basedon-webx-dubbo
api based on webx and dubbo, quick build and ready for micro-services

### Advantage

* Quick build;
* Distributed system;
* RPC management from dubbo-admin;
* Code structure grows with business;

### Code structure

project    
|    
|-- **api**    request receiver, war package, depends on `client` and `dubbo client`, DUBBO consumer, single/multi-instance deploy    
|    
|-- **biz**     jar package,implementations of `client interfaces`, biz logic and data logic, depends on `client`     
|    
|-- **client**    jar package, RPC interfaces and RPC beans(data model)     
|    
|-- **service**    war package, depends on `client` and `biz`, with kinds of datasource config files, DUBBO provider     
|    
|-- **scripts**     package scripts    

### Integration Style (dev and deploy)

*//**TODO***

### Micro-service Style (dev and deploy)

*//**TODO***

### Related

* webx
* dubbo
* maven
