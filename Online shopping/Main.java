#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as,fl,sn,am;
  std :: cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  fl=(fa-(fa*fd/100))+fs;
  sn=(sa-(sa*sd/100))+ss;
  am=(aa-(aa*ad/100))+as;
  std :: cout<<"In Flipkart Rs."<<fl<<"\n";
  std :: cout<<"In Snapdeal Rs."<<sn<<"\n";
  std :: cout<<"In Amazon Rs."<<am<<"\n";
  if(fl<=sn && fl<=am)
    std :: cout<<"He will prefer Flipkart";
  else if(sn<fl && sn<<am)
    std :: cout<<"He will prefer Snapdeal";
  else
    std :: cout<<"He will prefer Amazon";
}