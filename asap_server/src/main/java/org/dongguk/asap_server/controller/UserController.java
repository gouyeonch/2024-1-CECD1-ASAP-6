package org.dongguk.asap_server.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dongguk.asap_server.dto.common.ResponseDto;
import org.dongguk.asap_server.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserController {
    private final UserService userService;

    @GetMapping("/abnomal")
    public ResponseDto<?> readRealTimeStatus(@RequestParam("sect") String sect,
                                          @RequestParam("page") Integer page,
                                          @RequestParam("size") Integer size){

        return ResponseDto.ok(userService.readRealtimeStatus(sect, page, size));
    }


}
