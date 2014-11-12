#!/bin/bash

echo "wlan0 dhcp"
iwlist wlan0 scan
cd /usr/share/wifi
wpa_supplicant -Dwext -iwlan0  -c./wpa_supplicant.conf -B 
sleep 1
udhcpc  -i wlan0
ifconfig

