# mapstruct-demo
Demo of mapstruct. Automatic mapping tool without reflectio. MapStruct is a code generator that greatly simplifies the implementation of mappings between Java bean types based on a convention over configuration approach.
The generated mapping code uses plain method invocations and thus is fast, type-safe and easy to understand.

# Car mapper example
* Automatic mapping atributes with same name and type (ignoreProperty,surname, make)
* Custom converter Brake<->String. Property brake-> brakeName (@Mapper(uses = {CarConverters.class}))
* Mapping atributes with same type and different name: numberOfSeats->seatCount (You only have to declare in CarMapper)
* Ignore property wont be mapped (ignore=true)
* @DecoratedWith(CarMapperDecorator.class) will allow to overwrite any value.


![CarDtoDefintion](/images/CarDto.png?raw=true "Car DTO definition")
![BrakeConverter](/images/CustomBrakeConverter.png?raw=true "Custom Brake Converter definition")
![CarMapper](/images/CarMapper.png?raw=true "Car mapper definition")


# Customer mapper example (multiple mappers definition)

* CustomerMapper and OrderItemMapper definition class
* Automatic mapping atributes with same name and type (id,name,orders->orderItem). UserStatus is automatic mapped with toString Enun

![CustomerDtoDefintion](/images/CustomerDto.png?raw=true "Customer DTO definition")
![CustomerMapper](/images/CustomerMapper.png?raw=true "Customer mapper definition")
![OrderItemMapper](/images/OrderItemMapper.png?raw=true "OrderItem mapper definition")
