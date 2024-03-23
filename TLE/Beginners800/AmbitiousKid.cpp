// #include <iostream>
// #include <algorithm>
// using namespace std;

// void solve() {
//     int n;
//     cin >> n;
//     int arr[n];
//     for (int i = 0; i < n; i++) {
//         cin >> arr[i];
//     }
//     for (int i = 0; i < n; i++) {
//         abs(arr[i]);
//     }
//     sort(arr, arr + n);
//     cout << arr[0] << endl;
// }

// int main() {
//     int t;
//     cin >> t;
//     while (t-- > 0) {
//         solve();
//     }
//     return 0;
// }

#include <iostream>
#include <cmath> // For std::abs
using namespace std;

void solve()
{
    int n;
    cin >> n;
    int nums[n];
    for (int i = 0; i < n; ++i)
    {
        nums[i] = std::abs(nums[i]);
    }

    cout << nums[0] << endl;
}

int main()
{
    solve();
    // int t;
    // cin>>t;
    // while(t-->0){
    //     solve();
    // }
    // return 0;
}
