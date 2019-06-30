if __name__ == '__main__':
    n = int(raw_input())
    if ((n % 2 == 0) and (6 <= n <= 20)) or (n % 2 == 1):
        print "Weird"
    elif (n > 20) or ((n % 2 == 0) and (2 <= n <= 5)):
        print "Not Weird"