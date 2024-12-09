## Crear un pod mediante archivo yaml

```sh
kubectl apply -f nginx-pod.yaml
```

## Vamos a terminar el proceso principal del contenedor

```sh
kubectl exec nginx-always -- sh -c "kill 1"
```