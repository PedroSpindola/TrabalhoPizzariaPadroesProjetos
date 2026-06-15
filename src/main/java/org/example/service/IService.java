package org.example.service;

public interface IService {
    String avaliarServico(String mensagem);
    static IService getInstance();
}
