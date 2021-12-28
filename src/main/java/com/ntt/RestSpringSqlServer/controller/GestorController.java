package com.ntt.RestSpringSqlServer.controller;
import java.util.List;

import com.ntt.RestSpringSqlServer.model.Ciudad;
import com.ntt.RestSpringSqlServer.model.Gestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController
@RequestMapping("/api/v1")
public class GestorController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostMapping("/gestores")
    public List<Gestor> getAllGestores() {
        String sql = "SELECT * FROM GCCOBRANZAS.COB_GESTOR";
        List<Gestor> gestores = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Gestor.class));
        gestores.forEach(System.out :: println);
        return gestores;
    }

    @PostMapping("/ciudades")
    public int getAllCiudades() {
        String sql = "SELECT DISTINCT NOMBRE FROM GCINTEGRIDAD.GEN_LOCALIDAD WHERE TIPO='CIUDAD'";
        List<Ciudad> ciudades = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Ciudad.class));
        ciudades.forEach(System.out :: println);
        return ciudades.size();
    }

}
