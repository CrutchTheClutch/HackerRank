#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int arr_size;
int n;

int main() {
    scanf("%d", &arr_size);
    int arr[arr_size];
    for (int i = 0; i < arr_size; i++) {
        cin >> arr[i];
    }
    
    for (int j = arr_size-1; j >= 0; j--) {
        printf("%d ", arr[j]);
    }
    
    return 0;
}
