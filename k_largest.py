import heapq


def k_largest(arr,target):
    #by default heap remove or find the min
    #we want max so we will take (-)
    arr = [-elem for elem in arr]
    heapq.heapify(arr)
    for i in range(k-1):
        heapq.heappop(arr)
    return -heapq.heappop(arr)


arr = [1,-6,3,5,81]
k = int(input("Enter the target : "))
res = k_largest(arr,k)
print("Result : ",res)
