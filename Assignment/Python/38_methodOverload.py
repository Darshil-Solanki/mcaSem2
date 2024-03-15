class Demo:
    def test(self,*vargs):
        if(len(vargs)==0):
            print("Test with zero parameter.")
        elif(len(vargs)==1):
            if(isinstance(vargs[0],int)):
                print("Integer:",vargs[0])
            elif(isinstance(vargs[0],float)):
                print("Float:",vargs[0])
            else:
                pass
        elif(len(vargs)==2):
            if(isinstance(vargs[0],int) and isinstance(vargs[1],int)):
                print("Two integer {0} and {1}".format(vargs[0],vargs[1]))
            else:
                print("Provide two integer!!!")
        else:
            pass
    

d = Demo()
d.test()
d.test(1)
d.test(1,2)
d.test(1.2)