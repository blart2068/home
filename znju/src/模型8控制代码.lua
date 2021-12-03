wifi.setmode(wifi.STATION)  
wifi.sta.config("WXblart","59675271")  
print(wifi.sta.getip())  
led1 = 1  
led2 = 2  
led3 = 3  
led4 = 4  
led5 = 5  
led6 = 6  
led7 = 7  
led8 = 8 
led9 = 9 
led10 = 10 
gpio.mode(led1, gpio.OUTPUT)  
gpio.mode(led2, gpio.OUTPUT)  
gpio.mode(led3, gpio.OUTPUT)  
gpio.mode(led4, gpio.OUTPUT)  
gpio.mode(led5, gpio.OUTPUT)  
gpio.mode(led6, gpio.OUTPUT)  
gpio.mode(led7, gpio.OUTPUT)  
gpio.mode(led8, gpio.OUTPUT)  
gpio.mode(led9, gpio.OUTPUT)  
gpio.mode(led10, gpio.OUTPUT)  
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
        buf = buf.."<h1>(3) <a href=\"?pin=ON3\"><button><h1>ON</button></a> <a href=\"?pin=OFF3\"><button><h1>OFF</button></a></h1>";  
        buf = buf.."<h1>(4) <a href=\"?pin=ON4\"><button><h1>ON</button></a> <a href=\"?pin=OFF4\"><button><h1>OFF</button></a></h1>";  
        buf = buf.."<h1>(5) <a href=\"?pin=ON5\"><button><h1>ON</button></a> <a href=\"?pin=OFF5\"><button><h1>OFF</button></a></h1>";  
        buf = buf.."<h1>(6) <a href=\"?pin=ON6\"><button><h1>ON</button></a> <a href=\"?pin=OFF6\"><button><h1>OFF</button></a></h1>";  
        buf = buf.."<h1>(7) <a href=\"?pin=ON7\"><button><h1>ON</button></a> <a href=\"?pin=OFF7\"><button><h1>OFF</button></a></h1>";  
        buf = buf.."<h1>(8) <a href=\"?pin=ON8\"><button><h1>ON</button></a> <a href=\"?pin=OFF8\"><button><h1>OFF</button></a></h1>";
        buf = buf.."<h1>(9) <a href=\"?pin=ON9\"><button><h1>ON</button></a> <a href=\"?pin=OFF9\"><button><h1>OFF</button></a></h1>";    
        buf = buf.."<h1>(10) <a href=\"?pin=ON10\"><button><h1>ON</button></a> <a href=\"?pin=OFF10\"><button><h1>OFF</button></a></h1>";    
        local _on,_off = "",""  
        if(_GET.pin == "OFF1")then  
              gpio.write(led1, gpio.HIGH);  
        elseif(_GET.pin == "ON1")then  
              gpio.write(led1, gpio.LOW);  
        elseif(_GET.pin == "OFF2")then  
              gpio.write(led2, gpio.HIGH);  
        elseif(_GET.pin == "ON2")then  
              gpio.write(led2, gpio.LOW);
        elseif(_GET.pin == "OFF3")then  
              gpio.write(led3, gpio.HIGH);  
        elseif(_GET.pin == "ON3")then  
              gpio.write(led3, gpio.LOW);  
        elseif(_GET.pin == "OFF4")then  
              gpio.write(led4, gpio.HIGH);  
        elseif(_GET.pin == "ON4")then  
              gpio.write(led4, gpio.LOW);
        elseif(_GET.pin == "OFF5")then  
              gpio.write(led5, gpio.HIGH);  
        elseif(_GET.pin == "ON5")then  
              gpio.write(led5, gpio.LOW);
        elseif(_GET.pin == "OFF6")then  
              gpio.write(led6, gpio.HIGH);  
        elseif(_GET.pin == "ON6")then  
              gpio.write(led6, gpio.LOW);
        elseif(_GET.pin == "OFF7")then  
              gpio.write(led7, gpio.HIGH);  
        elseif(_GET.pin == "ON7")then  
              gpio.write(led7, gpio.LOW);
        elseif(_GET.pin == "OFF8")then  
              gpio.write(led8, gpio.HIGH);  
        elseif(_GET.pin == "ON8")then  
              gpio.write(led8, gpio.LOW);
        elseif(_GET.pin == "OFF9")then  
              gpio.write(led9, gpio.HIGH);  
        elseif(_GET.pin == "ON9")then  
              gpio.write(led9, gpio.LOW);
        elseif(_GET.pin == "OFF10")then  
              gpio.write(led10, gpio.HIGH);  
        elseif(_GET.pin == "ON10")then  
              gpio.write(led10, gpio.LOW);
        end  
        client:send(buf);  
        client:close();  
        collectgarbage();  
    end)  
end)  