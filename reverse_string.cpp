#include<iostream>
using namespace std;
 
int main () {
   
   char name[50];
   cout << "enter your name \n";
   cin >> name;
   cout << name << endl;

   int length=0;
   for(int j=0;name[j]!='\0';j++)  length++;

   cout << "no of digit" << length <<"\n";
   
   for (int j = length - 1 ; j  >= 0 ; j--)
   {
   	cout << name[j];
   }
   return 0;
}
