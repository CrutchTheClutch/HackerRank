#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;


int main(){
    int n;
    cin >> n;
    
    if (n < 1 || n > 9) {
        printf("Greater than 9");
    }
    else if (n == 1) {
        printf("one");
    }
    else if (n == 2) {
        printf("two");
    }
    else if (n == 3) {
        printf("three");
    }
    else if (n == 4) {
        printf("four");
    }
    else if (n == 5) {
        printf("five");
    }
    else if (n == 6) {
        printf("six");
    }
    else if (n == 7) {
        printf("seven");
    }
    else if (n == 8) {
        printf("eight");
    }
    else if (n == 9) {
        printf("nine");
    }
    
    return 0;
}
