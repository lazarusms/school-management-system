package org.example.service;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import com.google.gson.Gson;
import org.example.model.Endereco;

public class CepService {

    public Endereco abEndereco(String cep) {
        try {
            URL url = new URL("https://viacep.com.br/ws/"+cep+"/json/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();

            Gson gson = new Gson();
            while ((cep = reader.readLine()) != null) {
                response.append(cep);
            }
            reader.close();
            return gson.fromJson(response.toString(), Endereco.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}