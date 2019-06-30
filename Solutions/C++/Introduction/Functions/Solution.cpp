#include <iostream>
#include <cstdio>
using namespace std;

int greater_num(int z, int y) {
    if (z > y) {
        return z;
    }
    return y;
}

int max_of_four(int a, int b, int c, int d) {
    int n1 = greater_num(a, b);
    int n2 = greater_num(n1, c);
    int res = greater_num(n2, d);
    return res;
}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}

