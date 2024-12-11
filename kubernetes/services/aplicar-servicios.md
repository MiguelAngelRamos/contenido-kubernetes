```sh
kubectl apply -f kubernetes/services/mysql-service.yaml
kubectl apply -f mysql-service-nodeport.yaml
```
```sh
kubectl apply -f kubernetes/services/user-service.yaml
```

```sh
kubectl apply -f kubernetes/services/order-service.yaml
```

```sh
kubectl apply -f user-service-nodeport.yaml
``` 

```sh
kubectl apply -f order-service-nodeport.yaml
```
