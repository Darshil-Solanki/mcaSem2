class Demo:
    def test(self,*vargs):
        if(len(vargs)==0):
            print("Test with zero parameter.")
        elif(len(vargs)==1):
            print("Test with one parameter.")
        elif(len(vargs)==2):
            print("Test with two parameter.")
        else:
            pass
    

d = Demo()
d.test()
d.test(1)
d.test(1,2)
d.test(1.2)