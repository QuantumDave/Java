import java.lang.*;
class Test {
int a, b;
Test(int i, int j) {
a = i;
b = j;
}
// return true if o is equaltotheinvoking// object
boolean equals(Test o) {
if(o.a == a && o.b == b) return true;
else return false;
}
}