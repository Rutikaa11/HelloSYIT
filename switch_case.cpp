#include<iostream.h>
#include<conio.h>
int size, val;
void disp(int size);
void sort(int size);
void reverse(int size);
void search(int val, int size);
int arr[20];
int main()
{
int i,ch;
cout<<" ";
cin>>size;
for(i=0;i<size; i++)
{
cin>>arr[i];
}
cout<<"\n***Main Menu*** \n";
cout<<"1.Display\n";
cout<<"2.Sorting\n";
cout<<"3.Reverse\n";
cout<<"Enter your choice: ";
cin>>ch;
switch(ch)
{
case 1: disp( size);
break;

case 2: sort( size);
break;

case 3: reverse( size);
break;

case 4: cout<<"Enter value to search: ";
cin>>val;
search(val, size);
break;
}
getch();
return 0;
}
void search(int val,int size)
{
int i;
for(i = 0; i<size;i++)
{
if(arr[i] == val)
{
cout<<"Value is found at position."<<i;
break;
}
}
if(i == size)
{
cout<<"Value is not found";
}
}
void disp(int size)
{
int i;
cout<<"Given array:\n";
for(i = 0; i< size; i++)
{
cout<<"\n"<<arr[i];
}
}
void sort(int size)
{
int i,j;
for(i = 0;i<size; i++)
{
for(j= 0;j<size;j++)
{
if(arr[j]>arr[j+1])
{
int temp;
temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
}
}
}
cout<<"Sorted Array: \n";
for(i = 0; i<size;i++)
{
cout<<"\n"<<arr[i];
}
}

void reverse(int size)
{
int i,j,temp;
j = size - 1;
i = 0;
while(i<j)
{
temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
i++;
j--;
}
cout<<"Reverse order: \n";
for(i=0;i<size;i++)
{
cout<<"\n"<<arr[i];
}
}