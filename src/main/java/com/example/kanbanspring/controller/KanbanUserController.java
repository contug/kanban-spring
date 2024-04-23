package com.example.kanbanspring.controller;


import com.example.kanbanspring.dto.KanbanUserDto;
import com.example.kanbanspring.service.KanbanUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class KanbanUserController {

    private final KanbanUserService kanbanUserService;

    public KanbanUserController(KanbanUserService kanbanUserService) {
        this.kanbanUserService = kanbanUserService;
    }

    @GetMapping()
    @ResponseBody
    public KanbanUserDto getUserById(@RequestParam Long id) {
        return kanbanUserService.getUserById(id);
    }
}
