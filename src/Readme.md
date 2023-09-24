Decorator pattern is a structural design pattern which is generally used when we want to enhance the capabilty of base clas but these enhancements can be one or many or different combinations of enhancements itself.

In this the baseClass is defined as interface the baseDecorator class is an abstract class which implements the baseClass as all the decorators wil be baseClass in itself.

The concrete decorator classes extends the baseDecorator Class and they have BaseClass using composition , so in DecoratorPattern the base decorator class has is-a as well as has-a relationship with BaseClass