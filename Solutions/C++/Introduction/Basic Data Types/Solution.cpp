#include <iostream>
#include <cstdio>
using namespace std;

int i;
long l;
char c;
float f;
double d;

int main() {
    scanf("%d %ld %c %f %lf", &i, &l, &c, &f, &d);
    printf("%d\n%ld\n%c\n%f\n%lf", i, l, c, f, d);
    return 0;
}
