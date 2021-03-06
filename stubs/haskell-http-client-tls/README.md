# TryTLS stub for `http-client-tls` Haskell package

`http-client-tls` can be found from:

 * [Hackage](https://hackage.haskell.org/package/http-client-tls)
 * [Github](https://github.com/snoyberg/http-client)

## Build and run using Stack

You can use Haskell's `[stack](www.haskellstack.org)` tool to build the stub:

```console
$ stack build
```

and then run it with TryTLS runner:

```console
$ trytls https -- stack exec test-http-client-tls
```


## Build and run using Docker

You can use Docker to build the stub:

```console
$ docker build -t test-http-client-tls --rm .
```

and then run it with TryTLS runner:

```console
$ trytls https -- docker run --rm test-http-client-tls
```

*Notice!* Since trytls can't inject CA bundle inside container from
outside, these tests will fail.
