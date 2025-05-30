#include <bits/stdc++.h>
using namespace std;

void rotateByOne(vector<int>& arr) {
    int n = arr.size();
    if (n == 0) return;

    int last = arr[n - 1];
    for (int i = n - 1; i > 0; --i) {
        arr[i] = arr[i - 1];
    }
    arr[0] = last;
}

void printArray(const vector<int>& arr) {
    for (int num : arr)
        cout << num << " ";
    cout << "\n";
}

int main() {
    vector<int> arr1 = {1, 2, 3, 4, 5};
    rotateByOne(arr1);
    printArray(arr1);

    vector<int> arr2 = {9, 8, 7, 6, 4, 2, 1, 3};
    rotateByOne(arr2);
    printArray(arr2);

    return 0;
}