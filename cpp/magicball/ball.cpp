#include <iostream>
#include <random>
#include <ctime>
#include <string>

using namespace std;

int main()
{
    srand(time(0));
    string str;
    cout << "What's your question: ";
    getline(cin, str);

    cout << str << endl;

    return 0;
}