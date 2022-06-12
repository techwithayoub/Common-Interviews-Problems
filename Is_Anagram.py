def are_anagrams(s1, s2):
    if len(s1) != len(s2):
        return False
    freq1 = {}
    freq2 = {}

    #convert list into hash table
    for ch in s1:
        if ch in freq1:
            freq1[ch] +=1
        else:
            freq1[ch] = 1

    for ch in s2:
        if ch in freq2:
            freq2[ch] +=1
        else:
            freq2[ch] = 1

    #comparaison of the two hash table

    for key in freq1:
        if key not in freq2 or freq1[key] != freq2[key]:
            return False

    return True



s1 = input("Enter first string : ")
s2 = input("Enter second string : ")
print(are_anagrams(s1,s2))
