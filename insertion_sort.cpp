#include<iostream>
using namespace std;

int main () {
    
    cout << "program to sort a array\n";
    int array1[10];

    cout << "enter the element array\n";
    for(int j = 0;j < 10;j++)  cin >> array1[j];

    int temp;
    for(int i = 0; i < 10; i++)
    {
    	for(int j = i; j < 10; j++)
    	{
    		if(array1[i] > array1[j])
    		{
    			temp =array1[i];
    			array1[i] = array1[j];
    			array1[j] = temp;
    		}
    	}
    }

    cout << "after sorting array become\n";
    for(int i =0 ;i < 10; i++)  cout << array1[i] << " ";

    return 0;
}