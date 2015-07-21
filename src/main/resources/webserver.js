/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var server = vertx.createHttpServer();

var Router = require("vertx-web-js/router");

var router = Router.router(vertx);

router.get("/").handler(function(routingContext) {
  var response = routingContext.response();
  response.putHeader("Content-Type", "text/plain");
  response.end("Hello World!");
  vertx.eventBus().send("myapp.events.hello", "Hello World");
});

server.requestHandler(router.accept).listen(8000);
