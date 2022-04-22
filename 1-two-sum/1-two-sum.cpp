class Solution {
public:
    vector<int> twoSum(vector<int>& g1, int target) {
        vector<int> g2;
        vector<int> g3;
        
        for (int a=0; a<g1.size(); a++)
        g2.push_back(g1[a]);   
        
        sort(g1.begin(), g1.end());  //sorted
        int n = g1.size();
        
        int i = 0;
        int j = n-1;
        int sum =0;
        int temp=0;
        
        for (auto i = g1.begin(); i != g1.end(); ++i)
        cout << *i << " ";    //sorted output
        
         for (int l = 0; l <g1.size() ; l++)
             
         { sum = g1.at(i)+g1.at(j);
           cout<<"\ni-> "<<g1.at(i)<<"\t j->"<< g1.at(j)<<endl;
          
             if(sum==target)
             {   for (int b=0; b<g2.size(); b++)
                { cout<<"value of b "<<b<<endl;
                    if(g2.at(b)==g1.at(i))
                    {   cout<<"\old b i-> "<<g2.at(b)<<" at "<<b<<endl;
                        g3.push_back(b); 
                        temp++;
                    }
                    else if(g2.at(b)==g1.at(j)){
                        cout<<"\old b j-> "<<g2.at(b)<<" at "<<b<<endl;
                        g3.push_back(b);
                        temp++;
                    }
                    else if(temp==2)  
                    break;
                }
              if(temp==2)
                    break;
                 
             }
             else if(sum<target)
             {    cout<<"smaller=>"<<sum<<endl;
                  i++;
                 
             }
             
             else if(sum>target)
             {  cout<<"larger=>"<<sum<<endl;
                 j--;
             }
         }
     return g3;
    }
};