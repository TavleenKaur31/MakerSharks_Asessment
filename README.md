# MakerSharks_Asessment

Database Config->

spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabasename
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

---------------------------------------------------------------------------------------------------------------------------------------


URL to SAVE a supplier -> http://localhost:8080/api/supplier/save
JSON body -> 
{
      "companyName": "TATA Tech. Info.",
      "website": "http://Tataupplier.com",
      "location": "India",
      "natureOfBusiness": "large_scale",
      "manufacturingProcesses": ["3d_printing", "coating " ,"AutoMobile"]
}

---->In response You will get a saved Suplier Data

-----------------------------------------------------------------------------------------------------------------------------------------


URL -> http://localhost:8080/api/supplier/query

JSON body->
 {
    "location": "India",
    "natureOfBusiness": "small_scale",
    "manufacturingProcess": "3d_printing",
    "size": 5
}

response->
[
    {
        "supplierId": 1,
        "companyName": "New Supplier Inc",
        "website": "http://newsupplier.com",
        "location": "India",
        "natureOfBusiness": "small_scale",
        "manufacturingProcesses": [
            "3d_printing",
            "coating"
        ]
    },
    {
        "supplierId": 4,
        "companyName": "Infotics Inc",
        "website": "http://infoticsupplier.com",
        "location": "India",
        "natureOfBusiness": "small_scale",
        "manufacturingProcesses": [
            "3d_printing",
            "AutoMobile"
        ]
    }
]

