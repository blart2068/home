wifi.setmode(wifi.STATION)  
wifi.sta.config("blart","59675271")  
print(wifi.sta.getip())  

--//------------------
i = 0;
function hs() --执行函数
--print(gpio.read(led)..led)
if(i==0)then 
  
  conn=net.createConnection(net.TCP, false) 
  conn:on("receive", function(conn, pl) print(pl) end)
  conn:connect(80,"192.168.199.1")
  conn:send("GET / HTTP/1.1\r\nHost: http://192.168.199.101/?pin=ON1\r\n"
    .."Connection: keep-alive\r\nAccept: */*\r\n\r\n")

     --gpio.write(led, gpio.HIGH) 
   elseif(i==1)then
    conn=net.createConnection(net.TCP, false) 
    conn:on("receive", function(conn, pl) print(pl) end)
    conn:connect(80,"121.41.33.127")
    conn:send("GET / HTTP/1.1\r\nHost: http://192.168.199.101/?pin=OFF1\r\n"
    .."Connection: keep-alive\r\nAccept: */*\r\n\r\n")
  
   
   
    
    --gpio.write(led, gpio.LOW) 
   end 
   
    i=i+1
   if (i==2) then
    i=0
   end
   
 end 
gpio.mode(6,gpio.INT) --中断函数pin----6
 function cs(dp)
  if(dp==0)then 
    hs()
    gpio.trig(6, "high")  else 
      gpio.trig(6, "low") 
   end 
 end 
 gpio.trig(6, "low",cs)

gpio.mode(5,gpio.INT) --中断函数pin----5
 function cs2(dp)
  if(dp==0)then 
    hs()
    gpio.trig(5, "high")  else 
      gpio.trig(5, "low") 
   end 
 end 
 gpio.trig(5, "low",cs2)
--//------------------ 
