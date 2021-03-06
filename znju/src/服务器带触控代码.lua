wifi.setmode(wifi.STATION)  
wifi.sta.config("blart","59675271")  
print(wifi.sta.getip())  
led1 = 1  
led2 = 2 
gpio.mode(led1, gpio.OUTPUT)  
gpio.mode(led2, gpio.OUTPUT) 
--//------------------
function hs(led) --执行函数
print(gpio.read(led)..led)
if(gpio.read(led)==0)then 
     gpio.write(led, gpio.HIGH) 
   elseif(gpio.read(led)==1)then 
    gpio.write(led, gpio.LOW) 
   end 
 end 
gpio.mode(6,gpio.INT) --中断函数pin----6
 function cs(dp)
  if(dp==0)then 
    hs(led1)
    gpio.trig(6, "high")  else 
      gpio.trig(6, "low") 
   end 
 end 
 gpio.trig(6, "low",cs)

gpio.mode(5,gpio.INT) --中断函数pin----5
 function cs2(dp)
  if(dp==0)then 
    hs(led2)
    gpio.trig(5, "high")  else 
      gpio.trig(5, "low") 
   end 
 end 
 gpio.trig(5, "low",cs2)
--//------------------ 
srv=net.createServer(net.TCP)  
srv:listen(80,function(conn)  
    conn:on("receive", function(client,request)  
        local buf = "";  
        local _, _, method, path, vars = string.find(request, "([A-Z]+) (.+)?(.+) HTTP");  
        if(method == nil)then  
            _, _, method, path = string.find(request, "([A-Z]+) (.+) HTTP");  
        end  
        local _GET = {}  
        if (vars ~= nil)then  
            for k, v in string.gmatch(vars, "(%w+)=(%w+)&*") do  
                _GET[k] = v  
            end  
        end  
        buf = buf.."<h1>BLART_0.1 good_luck</h1>";  
        buf = buf.."<h1>(1) <a href=\"?pin=ON1\"><button><h1>ON</button></a> <a href=\"?pin=OFF1\"><button><h1>OFF</button></a></h1>";  
        buf = buf.."<h1>(2) <a href=\"?pin=ON2\"><button><h1>ON</button></a> <a href=\"?pin=OFF2\"><button><h1>OFF</button></a></h1>";  
        local _on,_off = "",""  
        if(_GET.pin == "OFF1")then  
              gpio.write(led1, gpio.HIGH);  
        elseif(_GET.pin == "ON1")then  
              gpio.write(led1, gpio.LOW);  
        elseif(_GET.pin == "OFF2")then  
              gpio.write(led2, gpio.HIGH);  
        elseif(_GET.pin == "ON2")then  
              gpio.write(led2, gpio.LOW);  
        end  
        client:send(buf);  
        client:close();  
        collectgarbage();  
    end)  
end)