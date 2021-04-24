package ru.nn.dr.back.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nn.dr.back.service.InfoService;

import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@RestController
@RequestMapping("/info")
public class InfoController {

    private final InfoService infoService;

    @GetMapping("/camList")
    public ResponseEntity<Set<String>> getCamList() {
        return ResponseEntity.ok(infoService.camList());
    }

    @GetMapping("/models")
    public ResponseEntity<List<String>> getMethods() {
        return ResponseEntity.ok(infoService.methods());
    }

}
