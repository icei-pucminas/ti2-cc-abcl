/*
 *
 *  Air Horner
 *  Copyright 2015 Google Inc. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 *
 */

const version = "0.6.18";
const cacheName = `airhorner-${version}`;
self.addEventListener('install', e => {
  e.waitUntil(
    caches.open(cacheName).then(cache => {
      return cache.addAll([
        `/`,
        `/index.html`,
        `/login.html`,
        `/cadastro.html`,
        `/home.html`,
        `/Imagens/stock-pais-filhos.jpg`,
        `/Imagens/logoBrancoSemFundo.png`,
        `/Imagens/logoSemFundo.png`,
        `/Imagens/apple-touch-icon.png`,
        `/node_modules/mdbootstrap/css/bootstrap.min.css`,
        `/node_modules/mdbootstrap/css/mdb.min.css`,
        `/node_modules/mdbootstrap/css/style.css`,
        `/estilos/style.css`,
        `/estilos/sb-admin-2.css`,
        `/estilos/sb-admin-2.min.css`,
        `/estilos/styleInicial.css`,
        `/estilos/styles.css`,
        `/scripts/jquery-3.5.0.min.js`,
        `/scripts/script.js`,
        `/scripts/scripts.js`,
        `/scripts/demo/chart-area-demo.js`,
        `/scripts/demo/chart-bar-demo.js`,
        `/scripts/demo/chart-pie-demo.js`,
        `/recursos/chart.js/Chart.bundle.js`
      ])
          .then(() => self.skipWaiting());
    })
  );
});

self.addEventListener('activate', event => {
  event.waitUntil(self.clients.claim());
});

self.addEventListener('fetch', event => {
  event.respondWith(
    caches.open(cacheName)
      .then(cache => cache.match(event.request, {ignoreSearch: true}))
      .then(response => {
      return response || fetch(event.request);
    })
  );
});
