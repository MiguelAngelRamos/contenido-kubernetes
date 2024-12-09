## Codificación base 64 (Ubuntu)

```sh
miguel@DESKTOP-8F1GC6C:~$ echo -n "academy" | base64

YWNhZGVteQ==

miguel@DESKTOP-8F1GC6C:~$ echo -n "academy-user" | base64

YWNhZGVteS11c2Vy
 
```

## Codificación en base 64 (Windows - PowerShell)

```sh
[Convert]::ToBase64String([System.Text.Encoding]::UTF8.GetBytes("academy"))
```