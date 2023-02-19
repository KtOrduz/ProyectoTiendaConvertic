package com.proyecto.convertic.servicios;

import com.proyecto.convertic.entidades.Registro;
import com.proyecto.convertic.repositorios.RegistroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class RegistroServicio implements RegistroRepositorio{

    @Autowired
    private RegistroRepositorio registroRepositorio;


    @Override
    public List<Registro> findAll() {
        return null;
    }

    @Override
    public List<Registro> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Registro> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Registro> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Registro entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Registro> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Registro> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Registro> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Registro> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Registro> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Registro> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Registro> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Registro getOne(Integer integer) {
        return null;
    }

    @Override
    public Registro getById(Integer integer) {
        return null;
    }

    @Override
    public Registro getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Registro> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Registro> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Registro> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Registro> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Registro> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Registro> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Registro, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
