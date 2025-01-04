p// Online C++ compiler to run C++ program online
#include <iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main() 
{
  vector<vector<int>>vec={{1,2,3},{23,56,23,23,45,7},{12,4,67,56}};
                            // 3         6                      5
                            // vec[0]    vec[1]             vec[2]

  //vec size 3
  for(int i=0;i<vec.size();i++)
    {
      for(int j=0;j<vec[i].size();j++)
        {
          cout<<vec[i][j]<<" ";
        }
      cout<<endl;
    }







  // vector<int> vec={34,78,12,0,2,100,22};
  // for(int i=0;i<vec.size();i++)
  //     {
  //       cout<<vec[i]<<" ";
  //     }
  // cout<<endl;
  // sort(vec.begin(),vec.end());
  // for(int i=0;i<vec.size();i++)
  // {
  //   cout<<vec[i]<<" ";
  // }





  //erase
 // vector<int> vec{1,3,5,7,9};
 //  cout<<vec.size()<<endl;

 //  vec.erase(vec.begin()+2);
 //  cout<<vec.size()<<endl;

 //  vec.erase(vec.begin()+1);
 //  cout<<vec.size()<<endl;
 //  for(int i=0;i<vec.size();i++)
 //    {
 //      cout<<vec[i]<<" ";
 //    }






    // vector with fixed size and sam values
    // vector<int> vec(10,0);
    // for(int i=0;i<vec.size();i++)
    // {
    //   cout<<vec[i]<<" ";
    // }
    // cout<<vec[10]<<" ";





  // vector<int>vec={10,20,30,50,60};
  // //insert
  // vec.insert(vec.begin()+3,40);

  // for(int i=0;i<vec.size();i++)
  // {
  //   cout<<vec[i]<<" ";
  // }
  // cout<<endl;

  // //10 20 30 40 50 60
  // vec.insert(vec.begin()+0,1);
  // //1 10 20 30 40 50 60
  //  vec.insert(vec.begin()+6,90);
  // //1 10 20 30 40 50 90 60
  // for(int i=0;i<vec.size();i++)
  // {
  //   cout<<vec[i]<<" ";
  // }
  // 1 10 20 30 40 50 90 60
  //   vec[1]=100;






  // vector<int>vec;
  // int sizee;
  // cout<<"Enter size of array: ";
  // cin>>sizee;
  // for(int i=0;i<sizee;i++)
  //   {
  //     cout<<"Enter "<<i+1<<" element: ";
  //     int h;
  //     cin>>h;
  //     vec.push_back(h);

  //   }
  // for(int i=0;i<vec.size();i++)
  //   {
  //     cout<<vec[i]<<" ";
  //   }
  // cout<<endl;
  // vec.pop_back();
  // vec.pop_back();

  // for(int i=0;i<vec.size();i++)
  // {
  //   cout<<vec[i]<<" ";
  // }
  // vec[1]=20;






    // Write C++ code here
  //   vector<int>vector_1={12,45,23,4,34,22,2};
  //   cout<<vector_1.size()<<endl;  //size of vector
  // for(int i=0;i<vector_1.size();i++)
  // {
  //     cout<<vector_1[i]<<" ";
  // }
  //   cout<<endl;
  //   vector_1.push_back(34);
  //  vector_1.push_back(44); 
  // vector_1.push_back(54); 
  // vector_1.push_back(64);
  // vector<int>vec={23,45,6};

  // for(int i=0;i<vector_1.size();i++)
  // {
  //     cout<<vector_1[i]<<" ";
  // }
  //push_back
    // vector<string>
    // vector<bool>
    // vector<char>


    return 0;
}