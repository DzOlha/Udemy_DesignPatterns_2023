## Visitor Coding Exercise
You are asked to implement a double-dispatch visitor called `ExpressionPrinter`  
for printing different mathematical expressions. 
The range of expressions covers addition and multiplication - 
please put round brackets after around addition but not around multiplication! 
Also, please avoid any blank spaces in output.

Example:

* Input: `AdditionExpression(Value(2), Value(3))`

* Output: `(2+3)`

Here is the corresponding unit test:

```
AdditionExpression simple = new AdditionExpression(new Value(2), new Value(3));
ExpressionPrinter ep = new ExpressionPrinter();
ep.visit(simple);
assertEquals("(2+3)", ep.toString());
```