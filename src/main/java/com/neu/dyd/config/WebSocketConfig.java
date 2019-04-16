package com.neu.dyd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @DO:
 * @Program:pspenv
 * @Author 李君（2765395275）
 * @Create: 2019/4/15 21:27
 *--学海无涯苦作舟--
 */
@Configuration
public class WebSocketConfig {
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
