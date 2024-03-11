#!/bin/bash
for i in {1. .10000}
do
  curl -s http://localhost:9999/clientes/1/extrato > /dev/null
  curl -s http://localhost:9999/clientes/2/extrato > /dev/null
  curl -s http://localhost:9999/clientes/3/extrato > /dev/null
  curl -s http://localhost:9999/clientes/4/extrato > /dev/null
  curl -s http://localhost:9999/clientes/5/extrato > /dev/null
done